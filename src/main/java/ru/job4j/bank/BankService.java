package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывающий модель для банковской системы.
 * @author Vladimir Olenich
 * @version 1.0
 */
public class BankService {
    /**
     * Хранит всех клиентов банка и их счета.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента банка.
     * Если клиент уже существует. то добавление не происходит.
     * @param user ссылка на объект клиента.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет клиента банка.
     * Если передано значение null не чего не происходит.
     * @param passport данные паспорта по который происходит удаление клиента.
     * @return если удаление прошло успешно то true в противном случае false.
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый счёт клиенту.
     * Проверка на null если клиет не найден. Счёт не содастся.
     * @param passport данные паспорта клиента.
     * @param account счёт который будет добавлен клиенту.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод находит клиента по данным паспорта.
     * @param passport данные паспорта клиента.
     * @return возвращает данные по клиенту, если клиент не найден null.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод находит клиента по данным паспорта.
     * Проверяет есть ли такой клиент.
     * @param passport данные паспорта клиента.
     * @param requisite реквизиты счёта для поиска.
     * @return возвращает счёт, если не чего не найдено null.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account rsl = null;
        if (user != null) {
            List<Account> accountslist = users.get(user);
            for (Account account : accountslist) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод переводит деньги с одного счёта на другой.
     * Если счёт клиента существует и суммы на нём достаточно, будет совершен перевод.
     * @param srcPassport данные паспорта отправителя.
     * @param srcRequisite данные счёта отправителя.
     * @param destPassport данные паспорта получателя.
     * @param destRequisite данные счёта получателя.
     * @param amount сумма которую необходимо отправить.
     * @return true если операция прошла успешно.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
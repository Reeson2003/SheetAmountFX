package ru.reeson2003.persist_user.api.service;

import java.util.Date;

/**
 * Date: 26.08.2017.
 * Time: 11:46.
 *
 * @author Pavel Gavrilov.
 */
public interface DateQuery {
    UserQuery before(Date date);

    UserQuery after(Date date);

    UserQuery at(Date date);
}

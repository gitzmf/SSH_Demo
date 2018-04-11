package org.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.user.domain.User;

/**
 * Created by zmf on 2018/4/10.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    @Override
    public User getModel() {
        return null;
    }
}

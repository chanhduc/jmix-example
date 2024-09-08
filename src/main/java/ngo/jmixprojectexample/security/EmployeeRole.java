package ngo.jmixprojectexample.security;

import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;
import ngo.jmixprojectexample.entity.Expense;
import ngo.jmixprojectexample.entity.User;
import ngo.jmixprojectexample.entity.UserExpense;

@ResourceRole(name = "EmployeeRole", code = EmployeeRole.CODE, scope = "UI")
public interface EmployeeRole {
    String CODE = "employee-role";

    @EntityAttributePolicy(entityClass = UserExpense.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = UserExpense.class, actions = EntityPolicyAction.ALL)
    void userExpense();

    @EntityAttributePolicy(entityClass = User.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = User.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void user();

    @EntityAttributePolicy(entityClass = Expense.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Expense.class, actions = EntityPolicyAction.READ)
    void expense();

    @MenuPolicy(menuIds = "UserExpense.list")
    @ViewPolicy(viewIds = {"UserExpense.list", "User.list", "Expense.list"})
    void screens();
}
package ngo.jmixprojectexample.view.expense;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ngo.jmixprojectexample.entity.Expense;
import ngo.jmixprojectexample.view.main.MainView;


/**
 * @author Chanh-Duc Ngo
 * @created-date 08/09/2024
 */
@Route(value = "expenses/:id", layout = MainView.class)
@ViewController("Expense.detail")
@ViewDescriptor("expense-detail-view.xml")
@EditedEntityContainer("expenseDc")
public class ExpenseDetailView extends StandardDetailView<Expense> {
}
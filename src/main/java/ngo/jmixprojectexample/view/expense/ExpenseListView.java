package ngo.jmixprojectexample.view.expense;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ngo.jmixprojectexample.entity.Expense;
import ngo.jmixprojectexample.view.main.MainView;


/**
 * @author Chanh-Duc Ngo
 * @created-date 08/09/2024
 */
@Route(value = "expenses", layout = MainView.class)
@ViewController("Expense.list")
@ViewDescriptor("expense-list-view.xml")
@LookupComponent("expensesDataGrid")
@DialogMode(width = "64em")
public class ExpenseListView extends StandardListView<Expense> {
}
import date.User;
import service.DateService;

class Controller {
    private DateService dateService;

    public Controller(DateService dateService) {
        this.dateService = dateService;
    }
}

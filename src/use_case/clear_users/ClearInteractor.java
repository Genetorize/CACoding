package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearUserDataAccessObject; // final?

    final ClearOutputBoundary clearUserPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessObject,
                           ClearOutputBoundary clearUserPresenter) {
        this.clearUserDataAccessObject = clearUserDataAccessObject;
        this.clearUserPresenter = clearUserPresenter;
    }

    @Override
    public void execute() {
        clearUserDataAccessObject.deleteAllUser(); // this?
        clearUserPresenter.prepareSuccessview();
    }
}

package stepDefinitions;

public class TestContext {
	
	public DataContext dataContext;

    public TestContext() {
    	dataContext = new DataContext();
    }

    public DataContext getdataContext() {
            return dataContext;
    }
}



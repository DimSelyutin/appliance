package by.element.task.main.dao;

import by.element.task.main.dao.impl.FileApplianceDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO findappDAO = new FileApplianceDAOImpl();

    private DAOFactory(){
        
    };


    public static DAOFactory getInstance(){
        return instance;
    }

    public ApplianceDAO getFindApplianceDAO(){
        return findappDAO;
    }
}

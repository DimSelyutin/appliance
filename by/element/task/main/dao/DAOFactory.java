package by.element.task.main.dao;

import by.element.task.main.dao.impl.FindApplianceDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory(){};

    private final FindApplianceDAO findappDAO = new FindApplianceDAOImpl();

    public static DAOFactory getInstance(){
        return instance;
    }

    public FindApplianceDAO getFindApplianceDAO(){
        return findappDAO;
    }
}

package com.driver.services.impl;

import com.driver.model.Admin;
import com.driver.model.ServiceProvider;
import com.driver.repository.AdminRepository;
import com.driver.repository.CountryRepository;
import com.driver.repository.ServiceProviderRepository;
import com.driver.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository1;

    @Autowired
    ServiceProviderRepository serviceProviderRepository1;

    @Autowired
    CountryRepository countryRepository1;
    @Override
    public Admin register(String username, String password) {

        Admin admin = new Admin();
        admin.setPassword(password);
        admin.setUsername(username);
        Admin savedAdmin = adminRepository1.save(admin);
        return savedAdmin;
    }


    @Override
    public Admin addServiceProvider(int adminId, String providerName) {
        ServiceProvider serviceprovide = new ServiceProvider();
        Admin admin = new Admin();
        serviceprovide.setAdmin(admin.getId());
        admin.setServiceProviders(serviceprovide.getName());

    }


    public ServiceProvider addCountry(int serviceProviderId, String countryName) throws Exception{
    }
}

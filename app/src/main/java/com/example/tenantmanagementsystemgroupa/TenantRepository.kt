package com.example.tenantmanagementsystemgroupa

object TenantRepository {
    private val _tenants = mutableListOf<Tenant>()
    val tenants: List<Tenant> get() = _tenants

    fun addTenant(tenant: Tenant) {
        _tenants.add(tenant)
    }

    fun totalRent(): Double {
        return _tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}

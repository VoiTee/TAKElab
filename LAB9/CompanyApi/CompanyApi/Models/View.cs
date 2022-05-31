using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using Microsoft.EntityFrameworkCore;

namespace CompanyApi.Models
{
    [Keyless]
    public partial class View
    {
        public int EmployeeId { get; set; }
        [StringLength(15)]
        [Unicode(false)]
        public string? FirstName { get; set; }
        [StringLength(15)]
        [Unicode(false)]
        public string? LastName { get; set; }
        public int? ManagerId { get; set; }
        [Column(TypeName = "decimal(6, 2)")]
        public decimal? Salary { get; set; }
        [Column(TypeName = "decimal(6, 2)")]
        public decimal? Bonus { get; set; }
        public int? DepartmentId { get; set; }
    }
}

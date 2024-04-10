var Department = /** @class */ (function () {
    function Department(n) {
        this.name = n;
    }
    Department.prototype.describe = function () {
        console.log("Department : " + this.name);
    };
    return Department;
}());
var accounting = new Department("Accounting");
console.log(accounting);
console.log(accounting.describe());

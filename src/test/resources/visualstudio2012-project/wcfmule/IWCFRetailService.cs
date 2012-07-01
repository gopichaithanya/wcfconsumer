using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace wcfmule
{

    [ServiceContract]
    public interface IWCFRetailService
    {

        [OperationContract]
        string CreateOrder(Order order);

    }
}

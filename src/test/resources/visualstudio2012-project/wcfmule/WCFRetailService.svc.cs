using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace wcfmule
{
    public class WCFRetailService : IWCFRetailService
    {

        public string CreateOrder(Order order) {

            Random random = new Random();
            
            int newOrderId = random.Next();
            order.Id = newOrderId.ToString();

            // do something with the order...

            return order.Id;
        }
    }
}

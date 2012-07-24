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
            System.Diagnostics.Debug.WriteLine("Order received: " + order.Id + "; product id: " + order.ProductId + "; quantity: " + order.Quantity);

            return order.Id;
        }
    }
}

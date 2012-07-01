using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace wcfmule
{
    [DataContract]
    public class Order
    {
        private String id;
        private String productId;
        private String quantity;

        [DataMember]
        public String Id
        {
            get { return this.id; }
            set { this.id = value; }
        }

        [DataMember]
        public String ProductId
        {
            get { return this.productId; }
            set { this.productId = value; }
        }

        [DataMember]
        public String Quantity
        {
            get { return this.quantity; }
            set { this.quantity = value; }
        }

    }
}
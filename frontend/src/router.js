
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"
import OrderProcessingManager from "./components/listers/OrderProcessingCards"
import OrderProcessingDetail from "./components/listers/OrderProcessingDetail"

import OrderDetailsViewView from "./components/OrderDetailsViewView"
import OrderDetailsViewViewDetail from "./components/OrderDetailsViewViewDetail"
import PaymentHistoryManager from "./components/listers/PaymentHistoryCards"
import PaymentHistoryDetail from "./components/listers/PaymentHistoryDetail"


import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },
            {
                path: '/orderProcessings',
                name: 'OrderProcessingManager',
                component: OrderProcessingManager
            },
            {
                path: '/orderProcessings/:id',
                name: 'OrderProcessingDetail',
                component: OrderProcessingDetail
            },

            {
                path: '/orderDetailsViews',
                name: 'OrderDetailsViewView',
                component: OrderDetailsViewView
            },
            {
                path: '/orderDetailsViews/:id',
                name: 'OrderDetailsViewViewDetail',
                component: OrderDetailsViewViewDetail
            },
            {
                path: '/paymentHistories',
                name: 'PaymentHistoryManager',
                component: PaymentHistoryManager
            },
            {
                path: '/paymentHistories/:id',
                name: 'PaymentHistoryDetail',
                component: PaymentHistoryDetail
            },


            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },



    ]
})

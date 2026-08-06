package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oh7 {
    public static final String[] a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] b = {"ad_impression"};
    public static final String[] c = {"ad_impression", "in_app_purchase"};
    public static final String[] d = {"ad_impression"};
    public static final String[] e = {"ad_impression", "in_app_purchase"};
    public static final String[] f = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] g = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final /* synthetic */ int h = 0;

    public static final yq6 a(kb6 kb6Var, oh4 oh4Var) {
        final yq6 yq6Var;
        kb6Var.getClass();
        Object obj = kb6Var.e;
        Object obj2 = kb6.j;
        yq6 yq6Var2 = obj != obj2 ? new yq6(oh4Var.invoke(kb6Var.d())) : new yq6();
        yq6Var2.k(kb6Var, new jva(new zga(1, yq6Var2, oh4Var)));
        final cl8 cl8Var = new cl8();
        cl8Var.t = true;
        if (yq6Var2.e != obj2) {
            cl8Var.t = false;
            yq6Var = new yq6(yq6Var2.d());
        } else {
            yq6Var = new yq6();
        }
        yq6Var.k(yq6Var2, new jva(new oh4() { // from class: iva
            @Override // defpackage.oh4
            public final Object invoke(Object obj3) {
                yq6 yq6Var3 = yq6Var;
                T tD = yq6Var3.d();
                cl8 cl8Var2 = cl8Var;
                if (cl8Var2.t || ((tD == 0 && obj3 != null) || (tD != 0 && !tD.equals(obj3)))) {
                    cl8Var2.t = false;
                    yq6Var3.j(obj3);
                }
                return g2b.a;
            }
        }));
        return yq6Var;
    }

    public static final ox6 b(ox6 ox6Var, oh4 oh4Var) {
        return ox6Var.H(new mh7(oh4Var));
    }
}

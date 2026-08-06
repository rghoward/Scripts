package defpackage;

import com.hwpo_training_app.leaderboards.details.header.di.ApiModule;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class la implements thb.c {
    public final /* synthetic */ px4 a;

    public la(px4 px4Var) {
        this.a = px4Var;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
        return new ma.b(new ae2(((ma.a) kl3.b(ma.a.class, o9a.a(this.a.getApplicationContext()))).e().a, new e9(), new yx(), new ApiModule(), new com.hwpo_training_app.leaderboards.details.list.di.ApiModule(), new com.hwpo_training_app.leaderboards.list.common.di.ApiModule(), new com.hwpo_training_app.leaderboards.valuedetails.di.ApiModule(), new com.hwpo_training_app.notifications.di.ApiModule(), new cy(), new h40()), new t09(lb2Var));
    }
}

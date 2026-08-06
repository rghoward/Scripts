package defpackage;

import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e14 implements qq1 {
    public final /* synthetic */ int t;
    public final /* synthetic */ fg8 u;

    public /* synthetic */ e14(fg8 fg8Var, int i) {
        this.t = i;
        this.u = fg8Var;
    }

    @Override // defpackage.qq1
    public final Object a(xu8 xu8Var) {
        int i = this.t;
        fg8 fg8Var = this.u;
        switch (i) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(fg8Var, xu8Var);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(fg8Var, xu8Var);
        }
    }
}

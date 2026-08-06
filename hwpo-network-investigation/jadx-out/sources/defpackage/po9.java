package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.UserIdentityStore;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class po9 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ po9(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = qo9.H;
                return Boolean.valueOf(((qo9.b) obj).b);
            default:
                return UserIdentityStore.userDataStore_delegate$lambda$0((Context) obj);
        }
    }
}

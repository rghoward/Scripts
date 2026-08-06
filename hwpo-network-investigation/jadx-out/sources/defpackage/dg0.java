package defpackage;

import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.PrivacyPolicyKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements ci4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ ox6 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ dg0(int i, int i2, mh4 mh4Var, ox6 ox6Var, String str) {
        this.x = str;
        this.u = ox6Var;
        this.y = mh4Var;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AvatarIconKt.FinAvatar$lambda$11(this.u, (AvatarWrapper) obj4, (jl9) obj3, this.v, this.w, (jt1) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PrivacyPolicyKt.PrivacyPolicy$lambda$3((String) obj4, this.u, (mh4) obj3, this.v, this.w, (jt1) obj, iIntValue2);
        }
    }

    public /* synthetic */ dg0(ox6 ox6Var, AvatarWrapper avatarWrapper, jl9 jl9Var, int i, int i2) {
        this.u = ox6Var;
        this.x = avatarWrapper;
        this.y = jl9Var;
        this.v = i;
        this.w = i2;
    }
}

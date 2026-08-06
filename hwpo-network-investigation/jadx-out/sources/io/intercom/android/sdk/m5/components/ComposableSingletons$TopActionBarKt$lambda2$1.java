package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ws0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$TopActionBarKt$lambda2$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda2$1();

    public final void invoke(jt1 jt1Var, int i) {
        int i2 = 2;
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "HC");
        avatarCreate.getClass();
        List listH = ws0.h(new AvatarWrapper(avatarCreate, false, i2, null));
        jt1Var.K(-78008415);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new t();
            jt1Var.C(objF);
        }
        jt1Var.B();
        TopActionBarKt.m90TopActionBarNpQZenA(null, "Hannah", "+5 others", null, listH, (mh4) objF, null, true, 0L, 0L, 0L, null, null, jt1Var, 12779952, 0, 8009);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}

package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a4a;
import defpackage.b4a;
import defpackage.b85;
import defpackage.bt1;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.f50;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.h37;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pv0;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh1;
import defpackage.uma;
import defpackage.y43;
import io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarIconKt$DefaultAvatar$1 implements ei4<pv0, jt1, Integer, g2b> {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ h37<uh1> $backgroundColor$delegate;
    final /* synthetic */ uh1 $customBackgroundColor;
    final /* synthetic */ h37<jl9> $cutShape$delegate;
    final /* synthetic */ long $defaultBackgroundColor;
    final /* synthetic */ h37<y43> $indicatorSize$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ jl9 $shape;
    final /* synthetic */ boolean $shouldDrawBorder;
    final /* synthetic */ long $textColor;

    public AvatarIconKt$DefaultAvatar$1(boolean z, jl9 jl9Var, boolean z2, h37<y43> h37Var, h37<jl9> h37Var2, h37<uh1> h37Var3, AvatarWrapper avatarWrapper, long j, uh1 uh1Var, long j2, long j3) {
        this.$isActive = z;
        this.$shape = jl9Var;
        this.$shouldDrawBorder = z2;
        this.$indicatorSize$delegate = h37Var;
        this.$cutShape$delegate = h37Var2;
        this.$backgroundColor$delegate = h37Var3;
        this.$avatarWrapper = avatarWrapper;
        this.$defaultBackgroundColor = j;
        this.$customBackgroundColor = uh1Var;
        this.$textColor = j2;
        this.$placeHolderTextSize = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$6$lambda$1$lambda$0(long j, h37 h37Var, f50.a.c cVar) {
        cVar.getClass();
        long jDefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(h37Var);
        int i = uh1.l;
        if (uh1.c(jDefaultAvatar_Rd90Nhg$lambda$2, uh1.j)) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(h37Var, j);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$6$lambda$3$lambda$2(uh1 uh1Var, long j, h37 h37Var, f50.a.d dVar) {
        dVar.getClass();
        AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(h37Var, uh1Var != null ? uh1Var.a : ColorExtensionsKt.m832darken8_81llA(j));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$6$lambda$5$lambda$4(long j, h37 h37Var, f50.a.b bVar) {
        bVar.getClass();
        long jDefaultAvatar_Rd90Nhg$lambda$2 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(h37Var);
        int i = uh1.l;
        if (uh1.c(jDefaultAvatar_Rd90Nhg$lambda$2, uh1.j)) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(h37Var, j);
        }
        return g2b.a;
    }

    public final void invoke(pv0 pv0Var, jt1 jt1Var, int i) {
        int i2;
        pv0Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | (jt1Var.J(pv0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        if (this.$isActive) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$6(this.$indicatorSize$delegate, y43.a(pv0Var.d(), 36.0f) > 0 ? 16.0f : 8.0f);
            this.$cutShape$delegate.setValue(new CutAvatarWithIndicatorShape(this.$shape, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate), null));
        } else {
            this.$cutShape$delegate.setValue(this.$shape);
        }
        ox6 ox6VarA = uma.a(AvatarIconKt.avatarBorder(gi0.c(pv0Var.k(), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(this.$backgroundColor$delegate), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), this.$shouldDrawBorder, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate));
        final AvatarWrapper avatarWrapper = this.$avatarWrapper;
        final long j = this.$defaultBackgroundColor;
        final uh1 uh1Var = this.$customBackgroundColor;
        final long j2 = this.$textColor;
        final long j3 = this.$placeHolderTextSize;
        final h37<uh1> h37Var = this.$backgroundColor$delegate;
        fl6 fl6VarD = dv0.d(di.a.a, false);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC = it1.c(jt1Var, ox6VarA);
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, fl6VarD);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        String imageUrl = avatarWrapper.getImageUrl(jt1Var, 0);
        sp0 sp0Var = di.a.e;
        kv0 kv0Var = kv0.a;
        ox6.a aVar2 = ox6.a.t;
        ox6 ox6VarH = kv0Var.f(aVar2, sp0Var).H(ir9.c);
        String label = avatarWrapper.getLabel();
        b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b));
        fr1 fr1VarB = gr1.b(-1513639009, new fi4<b4a, f50.a.c, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1
            public final void invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, int i3) {
                b4aVar.getClass();
                cVar.getClass();
                if ((i3 & 6) == 0) {
                    i3 |= jt1Var2.J(b4aVar) ? 4 : 2;
                }
                if ((i3 & 131) == 130 && jt1Var2.r()) {
                    jt1Var2.u();
                } else {
                    AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j2, j3, b4aVar.f(ox6.a.t, di.a.e), jt1Var2, 0, 0);
                }
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, Integer num) {
                invoke(b4aVar, cVar, jt1Var2, num.intValue());
                return g2b.a;
            }
        }, jt1Var);
        fr1 fr1VarB2 = gr1.b(427755177, new fi4<b4a, f50.a.b, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2
            public final void invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, int i3) {
                b4aVar.getClass();
                bVar.getClass();
                if ((i3 & 6) == 0) {
                    i3 |= jt1Var2.J(b4aVar) ? 4 : 2;
                }
                if ((i3 & 131) == 130 && jt1Var2.r()) {
                    jt1Var2.u();
                } else {
                    AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j2, j3, b4aVar.f(ox6.a.t, di.a.e), jt1Var2, 0, 0);
                }
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, Integer num) {
                invoke(b4aVar, bVar, jt1Var2, num.intValue());
                return g2b.a;
            }
        }, jt1Var);
        jt1Var.K(1981535699);
        boolean zI = jt1Var.i(j);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zI || objF == obj) {
            objF = new oh4() { // from class: io.intercom.android.sdk.m5.components.avatar.a
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$1$lambda$0(j, h37Var, (f50.a.c) obj2);
                }
            };
            jt1Var.C(objF);
        }
        oh4 oh4Var = (oh4) objF;
        jt1Var.B();
        jt1Var.K(1981548379);
        boolean zJ = jt1Var.J(uh1Var) | jt1Var.i(j);
        Object objF2 = jt1Var.f();
        if (zJ || objF2 == obj) {
            objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.components.avatar.b
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$3$lambda$2(uh1Var, j, h37Var, (f50.a.d) obj2);
                }
            };
            jt1Var.C(objF2);
        }
        oh4 oh4Var2 = (oh4) objF2;
        jt1Var.B();
        jt1Var.K(1981542035);
        boolean zI2 = jt1Var.i(j);
        Object objF3 = jt1Var.f();
        if (zI2 || objF3 == obj) {
            objF3 = new oh4() { // from class: io.intercom.android.sdk.m5.components.avatar.c
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$5$lambda$4(j, h37Var, (f50.a.b) obj2);
                }
            };
            jt1Var.C(objF3);
        }
        jt1Var.B();
        a4a.a(imageUrl, label, imageLoader, ox6VarH, fr1VarB, fr1VarB2, oh4Var, oh4Var2, (oh4) objF3, jt1Var, 12779520, 384, 256080);
        jt1Var.I();
        if (this.$isActive) {
            AvatarIconKt.AvatarActiveIndicator(pv0Var.f(ir9.j(aVar2, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate)), di.a.i), jt1Var, 0, 0);
        }
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var, Integer num) {
        invoke(pv0Var, jt1Var, num.intValue());
        return g2b.a;
    }
}

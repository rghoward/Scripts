package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.util.Patterns;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ae8;
import defpackage.ai1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.f50;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.hi0;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.k50;
import defpackage.k85;
import defpackage.kk;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nz1;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.we1;
import defpackage.wq0;
import defpackage.xj8;
import defpackage.z75;
import defpackage.zh1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.block.VideoFileBlockKt;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFileBlockKt {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void VideoFileBlock(ox6 ox6Var, final String str, final String str2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        ai1 ai1Var;
        final ox6 ox6Var3;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-224511788);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str2) ? 256 : 128;
        }
        int i6 = i3;
        if ((i6 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var4 = i4 != 0 ? aVar : ox6Var2;
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            k85.a aVar2 = new k85.a(context);
            aVar2.c = (str2 == null || str2.length() == 0) ? str : str2;
            aVar2.b();
            aVar2.c(R.drawable.intercom_image_load_failed);
            f50 f50VarA = k50.a(aVar2.a(), IntercomImageLoaderKt.getImageLoader(context), null, null, bj4VarO, 124);
            bj4VarO.K(-354210906);
            boolean zJ = ((i6 & 112) == 32) | bj4VarO.j(context);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new hi0(i5, str, context);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC = we1.c(ox6Var4, false, null, (mh4) objF, 15);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            float[] fArrB = zh1.b();
            zh1.d(fArrB, 0.0f);
            ox6 ox6VarK = ir9.k(640.0f, 180.0f, aVar);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i7 = IntercomTheme.$stable;
            ox6 ox6VarC3 = gi0.c(ox6VarK, intercomTheme.getColors(bj4VarO, i7).m757getBubbleBackground0d7_KjU(), al8.a);
            kv0 kv0Var = kv0.a;
            sp0 sp0Var = di.a.e;
            ox6 ox6VarF = kv0Var.f(ox6VarC3, sp0Var);
            if (isRemoteUrl(str)) {
                ai1Var = null;
            } else {
                ai1 ai1Var2 = new ai1(new ColorMatrixColorFilter(fArrB));
                ai1Var2.b = fArrB;
                ai1Var = ai1Var2;
            }
            ox6 ox6Var5 = ox6Var4;
            z75.a(f50VarA, "Video Thumbnail", ox6VarF, sp0Var, nz1.a.a, 0.0f, ai1Var, bj4VarO, 27696, 32);
            if (isRemoteUrl(str)) {
                bj4VarO.K(1592327134);
                z75.a(is7.a(R.drawable.intercom_play_arrow, bj4VarO, 0), "Play Video", gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 48.0f), kk.a(intercomTheme, bj4VarO, i7), ay8.a(50)), null, nz1.a.f, 0.0f, new wq0(5, intercomTheme.getColors(bj4VarO, i7).m752getActionContrastWhite0d7_KjU()), bj4VarO, 24632, 40);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1592845857);
                ae8.a(ir9.j(kv0Var.f(aVar, sp0Var), 32.0f), kk.a(intercomTheme, bj4VarO, i7), 0.0f, 0L, 0, 0.0f, bj4VarO, 0, 60);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            ox6Var3 = ox6Var5;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xeb
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return VideoFileBlockKt.VideoFileBlock$lambda$4(ox6Var3, str, str2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VideoFileBlock$lambda$2$lambda$1(String str, Context context) {
        if (isRemoteUrl(str)) {
            LinkOpener.handleUrl(str, context, Injector.get().getApi());
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VideoFileBlock$lambda$4(ox6 ox6Var, String str, String str2, int i, int i2, jt1 jt1Var, int i3) {
        VideoFileBlock(ox6Var, str, str2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final boolean isRemoteUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }
}

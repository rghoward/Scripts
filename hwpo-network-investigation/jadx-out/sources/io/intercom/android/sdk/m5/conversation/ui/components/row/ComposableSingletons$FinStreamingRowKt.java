package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.yi1;
import defpackage.zg5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FinStreamingRowKt {
    public static final ComposableSingletons$FinStreamingRowKt INSTANCE = new ComposableSingletons$FinStreamingRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f166lambda1 = new fr1(false, -283499477, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinStreamingRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = gi0.c(ir9.c(aVar, 1.0f), zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC2);
            b47.b(jt1Var, ir9.d(aVar, 16.0f));
            FinStreamingRowKt.FinStreamingRow(ws0.i(new Block.Builder().withType("paragraph").withText("<b>Hello</b> <i>World</i> Three <a href=\"http://test.com\">Four</a").build(), new Block.Builder().withType("paragraph").withText("Next line").build()), new StreamingPart(new Metadata("Bot", "AI Agent", 1726738186L, ws0.h(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))), ir9.c(aVar, 1.0f), jt1Var, 384, 0);
            b47.b(jt1Var, ir9.d(aVar, 16.0f));
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m232getLambda1$intercom_sdk_base_release() {
        return f166lambda1;
    }
}

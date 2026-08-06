package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a30;
import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.ws0;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Weight;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$EventRowKt {
    public static final ComposableSingletons$EventRowKt INSTANCE = new ComposableSingletons$EventRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f155lambda1 = new fr1(false, 340730863, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$EventRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            aj1 aj1VarA = yi1.a(new c30.h(16.0f, true, new a30()), di.a.m, jt1Var, 6);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6.a.t);
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
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            List listH = ws0.h(new EventLabelSegment("Participant added to conversation", null, 2, null));
            Avatar avatarBuild = new Avatar.Builder().withInitials("AA").build();
            avatarBuild.getClass();
            EventRowKt.EventRow(null, listH, new AvatarWrapper(avatarBuild, false, 2, null), jt1Var, 0, 1);
            List listI = ws0.i(new EventLabelSegment("John Doe", Weight.BOLD), new EventLabelSegment(" joined the conversation and ", null, 2, null), new EventLabelSegment("started typing", Weight.MEDIUM), new EventLabelSegment(" a very long message that should wrap to multiple lines", null, 2, null));
            Avatar avatarBuild2 = new Avatar.Builder().withInitials("JD").build();
            avatarBuild2.getClass();
            EventRowKt.EventRow(null, listI, new AvatarWrapper(avatarBuild2, false, 2, null), jt1Var, 0, 1);
            List listH2 = ws0.h(new EventLabelSegment("This is a very long event message that should definitely wrap to multiple lines to test the FlowRow implementation and ensure it maintains proper center alignment", null, 2, null));
            Avatar avatarBuild3 = new Avatar.Builder().withInitials("TL").build();
            avatarBuild3.getClass();
            EventRowKt.EventRow(null, listH2, new AvatarWrapper(avatarBuild3, false, 2, null), jt1Var, 0, 1);
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f156lambda2 = new fr1(false, -1878882646, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$EventRowKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$EventRowKt.INSTANCE.m221getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m221getLambda1$intercom_sdk_base_release() {
        return f155lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m222getLambda2$intercom_sdk_base_release() {
        return f156lambda2;
    }
}

package io.intercom.android.sdk.tickets;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.ws0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FIleAttachmentListKt {
    public static final ComposableSingletons$FIleAttachmentListKt INSTANCE = new ComposableSingletons$FIleAttachmentListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f344lambda1 = new fr1(false, 1721837306, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-1$1
        public final void invoke(oy8 oy8Var, jt1 jt1Var, int i) {
            oy8Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(R.drawable.intercom_ic_alert_circle, jt1Var, 0), "Error Icon", ir9.j(ox6.a.t, 16.0f), IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).m766getError0d7_KjU(), jt1Var, 440, 0);
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            invoke(oy8Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f345lambda2 = new fr1(false, 597838424, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                FIleAttachmentListKt.FileAttachmentList(null, ws0.i(new Ticket.TicketAttribute.FilesAttribute.File(BuildConfig.FLAVOR, "image.png", "https://www.google.com", FileType.IMAGE), new Ticket.TicketAttribute.FilesAttribute.File(BuildConfig.FLAVOR, "video.mp4", "https://www.google.com", FileType.VIDEO), new Ticket.TicketAttribute.FilesAttribute.File(BuildConfig.FLAVOR, "attachment.pdf", "https://www.google.com", FileType.ATTACHMENT)), jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m508getLambda1$intercom_sdk_base_release() {
        return f344lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m509getLambda2$intercom_sdk_base_release() {
        return f345lambda2;
    }
}

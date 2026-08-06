package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.net.Uri;
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
import defpackage.yi1;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.upload.data.MediaData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileRowKt {
    public static final ComposableSingletons$FileRowKt INSTANCE = new ComposableSingletons$FileRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f163lambda1 = new fr1(false, 242579061, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FileRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            aj1 aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.o, jt1Var, 54);
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
            Uri uri = Uri.EMPTY;
            uri.getClass();
            FileRowKt.FileRow(new MediaData.Media.Other("application/pdf", 0L, "pdf_with_very_long_and_boring_file_name.pdf", uri), BubbleMessageRowKt.m208getEndUserCornerShapeVpY3zN4$default(GroupingPosition.TOP, 0.0f, 0.0f, 6, null), null, null, null, jt1Var, 0, 28);
            MediaData.Media.Other other = new MediaData.Media.Other("text/plain", 0L, "text.txt", uri);
            GroupingPosition groupingPosition = GroupingPosition.MIDDLE;
            FileRowKt.FileRow(other, BubbleMessageRowKt.m208getEndUserCornerShapeVpY3zN4$default(groupingPosition, 0.0f, 0.0f, 6, null), null, null, null, jt1Var, 0, 28);
            FileRowKt.FileRow(new MediaData.Media.Other("application/zip", 0L, "zip_file_name.zip", uri), BubbleMessageRowKt.m208getEndUserCornerShapeVpY3zN4$default(groupingPosition, 0.0f, 0.0f, 6, null), null, null, null, jt1Var, 0, 28);
            FileRowKt.FileRow(new MediaData.Media.Other("text/csv", 0L, "csv_file_name.csv", uri), BubbleMessageRowKt.m208getEndUserCornerShapeVpY3zN4$default(groupingPosition, 0.0f, 0.0f, 6, null), null, null, null, jt1Var, 0, 28);
            FileRowKt.FileRow(new MediaData.Media.Other("application/random", 0L, "random_file_name.random", uri), BubbleMessageRowKt.m208getEndUserCornerShapeVpY3zN4$default(GroupingPosition.BOTTOM, 0.0f, 0.0f, 6, null), null, null, null, jt1Var, 0, 28);
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m229getLambda1$intercom_sdk_base_release() {
        return f163lambda1;
    }
}

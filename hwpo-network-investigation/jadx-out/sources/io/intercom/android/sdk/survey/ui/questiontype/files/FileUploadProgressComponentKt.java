package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.pc1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadProgressComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileUploadProgressComponentKt {
    public static final void FileUploadProgressComponent(final String str, mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        final mh4<g2b> mh4Var2 = mh4Var;
        str.getClass();
        mh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-1826067636);
        if ((i & 6) == 0) {
            i2 = i | (bj4VarO.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            mia.b(str, eo7.i(ir9.c(aVar, 1.0f), 16.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, (i3 & 14) | 48, 0, 131068);
            bj4VarO = bj4VarO;
            IntercomDividerKt.IntercomDivider(eo7.k(ir9.c(aVar, 1.0f), 0.0f, 4.0f, 1), bj4VarO, 6, 0);
            FileUploadErrorComponentKt.m491ActionRowFHprtrg(null, R.drawable.intercom_close, R.string.intercom_stop_upload, 0, 0L, mh4Var, bj4VarO, (i3 << 12) & 458752, 25);
            mh4Var2 = mh4Var;
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: my3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileUploadProgressComponentKt.FileUploadProgressComponent$lambda$1(str, mh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileUploadProgressComponent$lambda$1(String str, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        FileUploadProgressComponent(str, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UploadingActionSheetContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2021767087);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m488getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pc1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadingActionSheetContentPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        UploadingActionSheetContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}

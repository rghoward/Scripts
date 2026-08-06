package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xy1 implements yy1 {
    public final Object a;
    public final View b;

    public xy1(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    @Override // defpackage.yy1
    public final nib a(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new nib(wy1.a(this.a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    @Override // defpackage.yy1
    public final void b(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            wy1.a(this.a).notifyViewAppeared(viewStructure);
        }
    }

    @Override // defpackage.yy1
    public final AutofillId c(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = wy1.a(this.a);
        nf0 nf0VarA = fgb.a(this.b);
        Objects.requireNonNull(nf0VarA);
        return contentCaptureSessionA.newAutofillId(mf0.a(nf0VarA.a), j);
    }

    @Override // defpackage.yy1
    public final void d(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            wy1.a(this.a).notifyViewDisappeared(autofillId);
        }
    }

    @Override // defpackage.yy1
    public final void e(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }

    @Override // defpackage.yy1
    public final void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionA = wy1.a(this.a);
            nf0 nf0VarA = fgb.a(this.b);
            Objects.requireNonNull(nf0VarA);
            contentCaptureSessionA.notifyViewsDisappeared(mf0.a(nf0VarA.a), new long[]{Long.MIN_VALUE});
        }
    }
}

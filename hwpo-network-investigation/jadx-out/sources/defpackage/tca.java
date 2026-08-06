package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public enum tca {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(pt9.D, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(pt9.E, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(pt9.F, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(pt9.G, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(pt9.H, Build.VERSION.SDK_INT <= 26 ? com.hwpo_training_app.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object t;
    public final int u;
    public final int v;

    tca(Object obj, int i, int i2) {
        this.t = obj;
        this.u = i;
        this.v = i2;
    }
}

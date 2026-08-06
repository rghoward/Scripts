package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fca {
    public static final fca b = new fca(hf3.t);
    public final List<dca> a;

    /* JADX WARN: Multi-variable type inference failed */
    public fca(List<? extends dca> list) {
        this.a = list;
    }

    public final String toString() {
        return eca.a(')', "TextContextMenuData(components=", ab6.a(this.a, "\n\t", null, 56));
    }
}

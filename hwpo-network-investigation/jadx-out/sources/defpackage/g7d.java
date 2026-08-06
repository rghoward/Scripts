package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g7d {
    public final int[] a;
    public final e7d b;
    public e7d c;
    public int d;
    public int e;
    public int f;

    public g7d(int[] iArr) {
        this.a = iArr;
        e7d e7dVar = new e7d(-1, -1);
        this.b = e7dVar;
        this.c = e7dVar;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        HashMap map = this.c.d;
        int i = this.d;
        int[] iArr = this.a;
        e7d e7dVar = (e7d) map.get(Integer.valueOf(iArr[i]));
        while (true) {
            int i2 = (e7dVar.b - e7dVar.a) + 1;
            int i3 = this.e;
            if (i2 > i3) {
                return;
            }
            int i4 = this.d + i2;
            this.d = i4;
            this.c = e7dVar;
            int i5 = i3 - i2;
            this.e = i5;
            if (i5 > 0) {
                e7dVar = (e7d) e7dVar.d.get(Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final void b() {
        e7d e7dVar = this.c.c;
        if (e7dVar != null) {
            this.c = e7dVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        a();
    }

    public final void c(e7d e7dVar, StringBuilder sb) {
        for (e7d e7dVar2 : e7dVar.d.values()) {
            sb.append("  ");
            sb.append(e7dVar);
            sb.append(" -> ");
            sb.append(e7dVar2);
            sb.append(" [label=\"");
            int i = e7dVar2.a;
            int i2 = e7dVar2.b + 1;
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, i, Math.min(iArr.length, i2))));
            sb.append("\"]\n");
            c(e7dVar2, sb);
        }
    }

    public final boolean d(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        c(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class le7<E> {
    public Object[] a;
    public int b;

    public final E a() {
        if (!d()) {
            return (E) this.a[0];
        }
        px1.b("ObjectList is empty.");
        return null;
    }

    public final E b(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(E e) {
        Object[] objArr = this.a;
        int i = 0;
        if (e == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (e.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof le7) {
            le7 le7Var = (le7) obj;
            int i = le7Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = le7Var.a;
                fg5 fg5VarJ = uh8.j(0, i2);
                int i3 = fg5VarJ.t;
                int i4 = fg5VarJ.u;
                if (i3 > i4) {
                    return true;
                }
                while (xj5.a(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbB = t43.b(i, "Index ", " must be in 0..");
        sbB.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbB.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class x58<T> implements w58<T> {
    public final Object[] a;
    public int b;

    public x58(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            z90.a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.w58
    public boolean a(T t) {
        t.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = t;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == t) {
                aa0.c("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.w58
    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        t.getClass();
        objArr[i2] = null;
        this.b--;
        return t;
    }
}

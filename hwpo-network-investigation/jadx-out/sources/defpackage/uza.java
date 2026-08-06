package defpackage;

import androidx.emoji2.text.h;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uza {
    public static final ThreadLocal<yu6> d = new ThreadLocal<>();
    public final int a;
    public final h b;
    public volatile int c = 0;

    public uza(h hVar, int i) {
        this.b = hVar;
        this.a = i;
    }

    public final int a(int i) {
        yu6 yu6VarB = b();
        int iA = yu6VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = yu6VarB.b;
        int i2 = iA + yu6VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final yu6 b() {
        ThreadLocal<yu6> threadLocal = d;
        yu6 yu6Var = threadLocal.get();
        if (yu6Var == null) {
            yu6Var = new yu6();
            threadLocal.set(yu6Var);
        }
        zu6 zu6Var = this.b.a;
        int iA = zu6Var.a(6);
        if (iA != 0) {
            int i = iA + zu6Var.a;
            int i2 = (this.a * 4) + zu6Var.b.getInt(i) + i + 4;
            int i3 = zu6Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = zu6Var.b;
            yu6Var.b = byteBuffer;
            if (byteBuffer != null) {
                yu6Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                yu6Var.c = i4;
                yu6Var.d = yu6Var.b.getShort(i4);
                return yu6Var;
            }
            yu6Var.a = 0;
            yu6Var.c = 0;
            yu6Var.d = 0;
        }
        return yu6Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        yu6 yu6VarB = b();
        int iA = yu6VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? yu6VarB.b.getInt(iA + yu6VarB.a) : 0));
        sb.append(", codepoints:");
        yu6 yu6VarB2 = b();
        int iA2 = yu6VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + yu6VarB2.a;
            i = yu6VarB2.b.getInt(yu6VarB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.graphics.Path;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.HandlerThread;
import android.view.InputEvent;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ln4 implements Decoder, rt1, h99 {
    public static final Object u = new Object();
    public static j0d v;
    public static HandlerThread w;
    public final /* synthetic */ int t;

    public static j0d K0(Context context) {
        synchronized (u) {
            try {
                if (v == null) {
                    v = new j0d(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v;
    }

    public abstract boolean A0(px6 px6Var);

    public su6 B0(xu6 xu6Var) {
        ByteBuffer byteBuffer = xu6Var.w;
        byteBuffer.getClass();
        xl7.g(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return C0(xu6Var, byteBuffer);
    }

    public abstract su6 C0(xu6 xu6Var, ByteBuffer byteBuffer);

    @Override // kotlinx.serialization.encoding.Decoder
    public char D() {
        D0();
        throw null;
    }

    public void D0() {
        throw new td9(ll8.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object E0();

    @Override // kotlinx.serialization.encoding.Decoder
    public int F(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        D0();
        throw null;
    }

    public abstract void F0(fn5 fn5Var);

    @Override // defpackage.rt1
    public long G(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return Z();
    }

    public abstract Object G0(sd1 sd1Var);

    public abstract Object H0();

    @Override // defpackage.rt1
    public char I(h98 h98Var, int i) {
        h98Var.getClass();
        return D();
    }

    public abstract KSerializer I0(wn5 wn5Var, List list);

    @Override // defpackage.rt1
    public Object J(SerialDescriptor serialDescriptor, int i, sy2 sy2Var, Object obj) {
        serialDescriptor.getClass();
        sy2Var.getClass();
        return C(sy2Var);
    }

    public String J0() {
        return null;
    }

    @Override // defpackage.rt1
    public Object L(SerialDescriptor serialDescriptor, int i, sy2 sy2Var, Object obj) {
        serialDescriptor.getClass();
        sy2Var.getClass();
        if (sy2Var.getDescriptor().c() || d0()) {
            return C(sy2Var);
        }
        return null;
    }

    public abstract Object L0(r02 r02Var);

    public String M0() {
        return null;
    }

    @Override // defpackage.rt1
    public byte N(h98 h98Var, int i) {
        h98Var.getClass();
        return q0();
    }

    public abstract Path N0(float f, float f2, float f3, float f4);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int O();

    public abstract sy2 O0(wn5 wn5Var, String str);

    @Override // defpackage.rt1
    public short P(h98 h98Var, int i) {
        h98Var.getClass();
        return t0();
    }

    public abstract ud9 P0(wn5 wn5Var, Object obj);

    public abstract float Q0(kk6 kk6Var);

    @Override // defpackage.rt1
    public int R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return O();
    }

    public abstract int R0(int i);

    @Override // kotlinx.serialization.encoding.Decoder
    public String S() {
        D0();
        throw null;
    }

    public abstract void S0(int i);

    public abstract void T0(Typeface typeface, boolean z);

    public abstract ln4 U0(sd1 sd1Var, Object obj);

    public abstract int V0(int i);

    @Override // defpackage.h99
    public int W(int i) {
        int iR0 = R0(i);
        if (iR0 == -1 || R0(iR0) == -1) {
            return -1;
        }
        return iR0;
    }

    public abstract Object W0(sw9 sw9Var, r02 r02Var);

    @Override // defpackage.h99
    public int X(int i) {
        int iV0 = V0(i);
        if (iV0 == -1 || V0(iV0) == -1) {
            return -1;
        }
        return iV0;
    }

    public abstract Object X0(Uri uri, InputEvent inputEvent, r02 r02Var);

    public abstract Object Y0(Uri uri, r02 r02Var);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long Z();

    public abstract void Z0(kk6 kk6Var, float f);

    @Override // defpackage.rt1
    public boolean a0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return z();
    }

    public abstract void a1(byte[] bArr, int i, int i2);

    public abstract int b1();

    @Override // defpackage.rt1
    public String c0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return S();
    }

    public abstract ax1 c1(suc sucVar, kdc kdcVar, String str, Executor executor);

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean d0() {
        return true;
    }

    public abstract d9d d1(int i);

    public abstract Object e1(int i);

    public abstract void f1(suc sucVar, ServiceConnection serviceConnection);

    public abstract Object g1(d9d d9dVar);

    @Override // defpackage.rt1
    public void i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.h99
    public int i0(int i) {
        return V0(i);
    }

    @Override // defpackage.h99
    public int j0(int i) {
        return R0(i);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public rt1 n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder n0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.rt1
    public double o0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return y0();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte q0();

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short t0();

    public String toString() {
        switch (this.t) {
            case 10:
                return E0().toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.rt1
    public Decoder u(h98 h98Var, int i) {
        h98Var.getClass();
        return n0(h98Var.i(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float u0() {
        D0();
        throw null;
    }

    @Override // defpackage.rt1
    public float w0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return u0();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double y0() {
        D0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean z() {
        D0();
        throw null;
    }

    public abstract List z0(String str, List list);

    public /* synthetic */ ln4(int i) {
        this.t = i;
    }
}

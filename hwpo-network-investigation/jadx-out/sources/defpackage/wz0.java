package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements pt8<ByteBuffer, xl4> {
    public static final a f = new a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final sl4 e;
    public final a d = f;
    public final b c = g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final ArrayDeque a = new ArrayDeque(0);

        public final synchronized void a(lm4 lm4Var) {
            lm4Var.b = null;
            lm4Var.c = null;
            this.a.offer(lm4Var);
        }
    }

    public wz0(Context context, ArrayList arrayList, qq0 qq0Var, o30 o30Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new sl4(qq0Var, o30Var);
    }

    public static int d(km4 km4Var, int i, int i2) {
        int iMin = Math.min(km4Var.g / i2, km4Var.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbB = u43.b("Downsampling GIF, sampleSize: ", ", target dimens: [", "x", iMax, i);
            sbB.append(i2);
            sbB.append("], actual dimens: [");
            sbB.append(km4Var.f);
            sbB.append("x");
            sbB.append(km4Var.g);
            sbB.append("]");
            Log.v("BufferGifDecoder", sbB.toString());
        }
        return iMax;
    }

    @Override // defpackage.pt8
    public final kt8<xl4> a(ByteBuffer byteBuffer, int i, int i2, xk7 xk7Var) {
        lm4 lm4Var;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            try {
                lm4 lm4Var2 = (lm4) bVar.a.poll();
                if (lm4Var2 == null) {
                    lm4Var2 = new lm4();
                }
                lm4Var = lm4Var2;
                lm4Var.b = null;
                Arrays.fill(lm4Var.a, (byte) 0);
                lm4Var.c = new km4();
                lm4Var.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                lm4Var.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                lm4Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer2, i, i2, lm4Var, xk7Var);
        } finally {
            this.c.a(lm4Var);
        }
    }

    @Override // defpackage.pt8
    public final boolean b(ByteBuffer byteBuffer, xk7 xk7Var) {
        return !((Boolean) xk7Var.c(mm4.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final zl4 c(ByteBuffer byteBuffer, int i, int i2, lm4 lm4Var, xk7 xk7Var) {
        StringBuilder sb;
        int i3 = vd6.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            km4 km4VarB = lm4Var.b();
            if (km4VarB.c > 0 && km4VarB.b == 0) {
                Bitmap.Config config = xk7Var.c(mm4.a) == dn2.u ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(km4VarB, i, i2);
                a aVar = this.d;
                sl4 sl4Var = this.e;
                aVar.getClass();
                gz9 gz9Var = new gz9(sl4Var, km4VarB, byteBuffer, iD);
                gz9Var.d(config);
                gz9Var.b();
                Bitmap bitmapA = gz9Var.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(vd6.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                zl4 zl4Var = new zl4(new xl4(new xl4.a(new cm4(com.bumptech.glide.a.a(this.a), gz9Var, i, i2, l2b.b, bitmapA))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + vd6.a(jElapsedRealtimeNanos));
                }
                return zl4Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(vd6.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + vd6.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}

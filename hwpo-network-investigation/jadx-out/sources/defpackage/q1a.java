package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q1a implements pt8<InputStream, xl4> {
    public final ArrayList a;
    public final wz0 b;
    public final o30 c;

    public q1a(ArrayList arrayList, wz0 wz0Var, o30 o30Var) {
        this.a = arrayList;
        this.b = wz0Var;
        this.c = o30Var;
    }

    @Override // defpackage.pt8
    public final kt8<xl4> a(InputStream inputStream, int i, int i2, xk7 xk7Var) {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, xk7Var);
    }

    @Override // defpackage.pt8
    public final boolean b(InputStream inputStream, xk7 xk7Var) {
        return !((Boolean) xk7Var.c(mm4.b)).booleanValue() && a.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}

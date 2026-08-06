package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lmc extends h9c implements p7d {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public lmc(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        a78.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] i(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            sx0.a(e);
            return null;
        }
    }

    @Override // defpackage.h9c
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            y55 y55VarD = d();
            parcel2.writeNoException();
            xac.b(parcel2, y55VarD);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    @Override // defpackage.p7d
    public final y55 d() {
        return new se7(g());
    }

    @Override // defpackage.p7d
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        y55 y55VarD;
        if (obj instanceof p7d) {
            try {
                p7d p7dVar = (p7d) obj;
                if (p7dVar.e() == this.b && (y55VarD = p7dVar.d()) != null) {
                    return Arrays.equals(g(), (byte[]) se7.i(y55VarD));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.b;
    }
}

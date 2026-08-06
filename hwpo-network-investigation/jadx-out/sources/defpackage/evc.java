package defpackage;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class evc {
    public static final evc c = new evc(kuc.b, ztc.E());
    public final kuc a;
    public final ztc b;

    public evc(kuc kucVar, ztc ztcVar) {
        kucVar.getClass();
        this.a = kucVar;
        this.b = ztcVar;
    }

    public static evc a(s0c s0cVar, boolean z) throws k2c {
        kuc kucVarA;
        int iC = s0cVar.C();
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iC);
            sb.append(". Current version is: 1");
            throw new k2c(sb.toString());
        }
        s0cVar.C();
        int iA = s0cVar.a(s0cVar.A());
        f1c f1cVar = f1c.b;
        int i = h0c.a;
        ztc ztcVarD = ztc.D(s0cVar, f1c.c);
        s0cVar.b(iA);
        guc gucVar = new guc();
        Inflater inflater = gucVar.t;
        try {
            if (z) {
                int iA2 = s0cVar.a(s0cVar.A());
                int iC2 = s0cVar.c();
                try {
                    kucVarA = kuc.a(s0c.h(new InflaterInputStream(new duc(gucVar, s0cVar), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (s0cVar.c() != 0) {
                        throw new k2c("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    s0cVar.b(iA2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(s0cVar.z());
                try {
                    kucVarA = kuc.a(s0c.h(new buc(gucVar), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            gucVar.close();
            return new evc(kucVarA, ztcVarD);
        } catch (Throwable th3) {
            try {
                gucVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}

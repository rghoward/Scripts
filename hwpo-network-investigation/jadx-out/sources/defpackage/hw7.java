package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hw7 {
    public File a;
    public final e04 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final /* synthetic */ a[] y;

        static {
            a aVar = new a("ATTEMPT_MIGRATION", 0);
            t = aVar;
            a aVar2 = new a("NOT_GENERATED", 1);
            u = aVar2;
            a aVar3 = new a("UNREGISTERED", 2);
            v = aVar3;
            a aVar4 = new a("REGISTERED", 3);
            w = aVar4;
            a aVar5 = new a("REGISTER_ERROR", 4);
            x = aVar5;
            y = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) y.clone();
        }
    }

    public hw7(e04 e04Var) {
        this.b = e04Var;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        String str = "PersistedInstallation." + this.b.d() + ".json";
                        e04 e04Var = this.b;
                        e04Var.a();
                        File file = new File(e04Var.a.getNoBackupFilesDir(), str);
                        this.a = file;
                        if (file.exists()) {
                            return this.a;
                        }
                        e04 e04Var2 = this.b;
                        e04Var2.a();
                        File file2 = new File(e04Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo(this.a)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    public final void b(qe0 qe0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", qe0Var.b);
            jSONObject.put("Status", qe0Var.c.ordinal());
            jSONObject.put("AuthToken", qe0Var.d);
            jSONObject.put("RefreshToken", qe0Var.e);
            jSONObject.put("TokenCreationEpochInSecs", qe0Var.g);
            jSONObject.put("ExpiresInSecs", qe0Var.f);
            jSONObject.put("FisError", qe0Var.h);
            e04 e04Var = this.b;
            e04Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", e04Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final qe0 c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = iw7.a;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        a aVar = a.values()[iOptInt];
        if (aVar == null) {
            ac4.c("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3) {
            return new qe0(strOptString, aVar, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }
}

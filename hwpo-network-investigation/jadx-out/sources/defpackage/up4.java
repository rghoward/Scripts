package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class up4<T> implements g52<su8, T> {
    public final Gson a;
    public final TypeAdapter<T> b;

    public up4(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // defpackage.g52
    public final Object a(su8 su8Var) {
        Charset charsetA;
        su8 su8Var2 = su8Var;
        su8.a aVar = su8Var2.t;
        if (aVar == null) {
            hy0 hy0VarP = su8Var2.p();
            wq6 wq6VarM = su8Var2.m();
            if (wq6VarM == null || (charsetA = wq6.a(wq6VarM)) == null) {
                charsetA = ua1.b;
            }
            aVar = new su8.a(hy0VarP, charsetA);
            su8Var2.t = aVar;
        }
        JsonReader jsonReaderNewJsonReader = this.a.newJsonReader(aVar);
        try {
            T t = this.b.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            su8Var2.close();
            return t;
        } catch (Throwable th) {
            su8Var2.close();
            throw th;
        }
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tp4<T> implements g52<T, qp8> {
    public static final wq6 c;
    public final Gson a;
    public final TypeAdapter<T> b;

    static {
        ol8 ol8Var = wq6.e;
        c = wq6.a.a("application/json; charset=UTF-8");
    }

    public tp4(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // defpackage.g52
    public final qp8 a(Object obj) throws IOException {
        tx0 tx0Var = new tx0();
        JsonWriter jsonWriterNewJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(new ux0(tx0Var), StandardCharsets.UTF_8));
        this.b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return qp8.create(c, tx0Var.r(tx0Var.u));
    }
}

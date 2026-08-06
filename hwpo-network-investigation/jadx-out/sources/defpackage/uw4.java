package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uw4 implements thb.c {
    public final /* synthetic */ ie2 a;

    public uw4(ie2 ie2Var) {
        this.a = ie2Var;
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
        T t;
        final kv8 kv8Var = new kv8();
        q09 q09VarA = x09.a(lb2Var);
        ie2 ie2Var = this.a;
        je2 je2Var = new je2(ie2Var.a, ie2Var.b, new dy(), new xx(), new ve(), new we(), new aa7(), new ay(), new hu1(), new vx(), new wx(), new f31(), q09VarA);
        nf8 nf8Var = (nf8) ((sw4.b) kl3.b(sw4.b.class, je2Var)).a().get(cls);
        oh4 oh4Var = (oh4) lb2Var.a(sw4.d);
        Object obj = ((sw4.b) kl3.b(sw4.b.class, je2Var)).b().get(cls);
        if (obj == null) {
            if (oh4Var != null) {
                vh0.b(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                return null;
            }
            if (nf8Var == null) {
                vh0.b(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                return null;
            }
            t = (T) nf8Var.get();
        } else {
            if (nf8Var != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (oh4Var == null) {
                vh0.b(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                return null;
            }
            t = (T) oh4Var.invoke(obj);
        }
        t.addCloseable(new Closeable() { // from class: tw4
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                kv8Var.a();
            }
        });
        return t;
    }
}

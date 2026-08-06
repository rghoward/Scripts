package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public abstract class q2 extends thb.e implements thb.c {
    public abstract <T extends mhb> T b(String str, Class<T> cls, q09 q09Var);

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
        lb2Var.getClass();
        String str = (String) lb2Var.a(thb.b);
        if (str != null) {
            return (T) b(str, cls, x09.a(lb2Var));
        }
        aa0.c("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // thb.e
    public final void a(mhb mhbVar) {
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        cls.getClass();
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}

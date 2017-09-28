
// just making sure, u caught it

if (conn != null) {
    try {
        conn.close();
        conn = null;
    } catch (Exception e) {
        if (ex != null) {
            ex = e;
        }
    }
}
        ........
if (ex != null) {
    throw new Exception(ex.getMessage());
}

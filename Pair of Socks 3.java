// for good measure :)

} catch (Exception e) {
    e.printStackTrace();
    ex = e;
    logger.error(e.getMessage(), e);
    ctx.setRollbackOnly();
} finally {
    ......
    if (ex != null) {
       throw new Exception(...);
    }
}

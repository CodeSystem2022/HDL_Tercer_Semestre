import logging as log

log.basicConfig(level=log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])

if __name__ == '__main__':
    log.debug("Mensaje de DEBUG")
    log.info("Mensaje de INFO")
    log.warning("Mensaje de WARNING")
    log.error("Mensaje de ERROR")
    log.critical("Mensaje de CRITICAL")

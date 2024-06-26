package co.edu.unbosque.Papeleria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.unbosque.Papeleria.dao.DetalleVentasDAO;

@Controller
@RequestMapping("/detalleVentas")
public class DetalleVentasController {
//
//	@Autowired
//	private DetalleVentasDAO salesRepDao;
//
//	@GetMapping("/list_salesRep")
//	public ResponseEntity<List<DetalleVentas>> listSalesRep() {
//		List<DetalleVentas> logs = salesRepDao.listSaleRep();
//
//		if (logs.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		} else {
//			return new ResponseEntity<>(logs, HttpStatus.OK);
//		}
//	}
//
//	@PostMapping("/insert_salesRep")
//	public ResponseEntity<DetalleVentas> insertSalesRep(@RequestBody DetalleVentas log) {
//		DetalleVentas newLog = salesRepDao.insertSaleRep(log);
//		return new ResponseEntity<>(newLog, HttpStatus.CREATED);
//	}
//
//	@DeleteMapping("/delete_salesRep/{id}/{id2}/{id3}")
//	public ResponseEntity<Void> deleteSalesRep(@PathVariable int id, @PathVariable int id2, @PathVariable String id3) {
//		DetalleVentaId aux = new DetalleVentaId(id, id2, id3);
//		String resultado = salesRepDao.deleteSaleRep(aux);
//		if (resultado.equals("ELIMINACION EXITOSA")) {
//			return ResponseEntity.noContent().build();
//		} else {
//			return ResponseEntity.notFound().build();
//		}
//	}
//
//	@PutMapping("/edit_salesRep")
//	public ResponseEntity<DetalleVentas> editSalesRep(@RequestBody DetalleVentas cli) {
//		DetalleVentas editCustom = salesRepDao.editSaleRep(cli);
//		return new ResponseEntity<DetalleVentas>(editCustom, HttpStatus.ACCEPTED);
//
//	}
//
//	@GetMapping("/list_salesRep/{id}/{id2}/{id3}")
//	public ResponseEntity<Optional> listCostumbyId(@PathVariable int id, @PathVariable int id2, @PathVariable String id3) {
//		DetalleVentaId aux = new DetalleVentaId(id, id2, id3);
//		Optional<DetalleVentas> logs = salesRepDao.searchSaleRep(aux);
//		if (logs == null) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		} else {
//			return new ResponseEntity<>(logs, HttpStatus.OK);
//		}
//	}
}

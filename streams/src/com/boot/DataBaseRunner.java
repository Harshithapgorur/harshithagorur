package com.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.streams.DataBaseVendorDTO;
import com.streams.constant.TypeDataBaseVendorDTO;

public class DataBaseRunner {

	public static void main(String[] args) {
	Collection<DataBaseVendorDTO> ref=new LinkedList<DataBaseVendorDTO>();
	ref.add(new DataBaseVendorDTO("Oracle","multitenant",TypeDataBaseVendorDTO.ORACEL,2000,98763445));
	ref.add(new DataBaseVendorDTO("Microsoft","multitenant",TypeDataBaseVendorDTO.MICROSOFT,200,73445));
	ref.add(new DataBaseVendorDTO("IBM","multitenant",TypeDataBaseVendorDTO.IBM_INFORMIX,700,3498745));
	ref.add(new DataBaseVendorDTO("FileMaker","multitenant",TypeDataBaseVendorDTO.FILEMAKER,300,3448875));
	//find all databasevenderdto convert developes]dby to upper and print all the dto
ref.stream().map(dto->get)
	}

}
